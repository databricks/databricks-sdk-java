package com.databricks.sdk.mixin;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;

public class Paginator<REQ,RES,IT> implements Iterable<IT> {
  private final Function<REQ, RES> requestFn;
  private final Function<RES, Collection<IT>> itemsFn;
  private final Function<RES, REQ> nextPageFn;
  private REQ request;
  private RES response;
  private Iterator<IT> page;

  public Paginator(REQ request,
                   Function<REQ,RES> requestFn,
                   Function<RES, Collection<IT>> itemsFn,
                   Function<RES,REQ> nextPageFn) {
    this.request = request;
    // TODO: check if it makes sense to collapse requestFn & itemsFn to just Function<REQ,Collection<IT>>
    this.requestFn = requestFn;
    this.itemsFn = itemsFn;
    this.nextPageFn = nextPageFn;
    flip();
  }

  /*
  TODO:
  TODO: dedupes (for jobs & queries)
  TODO: limit + offset
  TODO: page+1
  TODO: token-based
  TODO: inline
  TODO: field

      {{if .Pagination.MultiRequest}}
        {{if .Pagination.NeedsOffsetDedupe -}}
        # deduplicate items that may have been added during iteration
        seen = set()
        {{- end}}{{if and .Pagination.Offset (not (eq .Path "/api/2.0/clusters/events")) }}
        query['{{.Pagination.Offset.Name}}'] = {{if eq .Pagination.Increment 1}}1{{else}}0{{end}}{{end}}
        while True:
          json = {{template "method-do" .}}
          if '{{.Pagination.Results.Name}}' not in json or not json['{{.Pagination.Results.Name}}']:
            return
          for v in json['{{.Pagination.Results.Name}}']:
            {{if .Pagination.NeedsOffsetDedupe -}}
            i = v['{{.Pagination.Entity.IdentifierField.Name}}']
            if i in seen:
              continue
            seen.add(i)
            {{end -}}
            yield {{.Pagination.Entity.PascalName}}.from_dict(v)
          {{if eq .Path "/api/2.0/clusters/events" -}}
          if 'next_page' not in json or not json['next_page']:
            return
          body = json['next_page']
          {{- else if .Pagination.Token -}}
          if '{{.Pagination.Token.Bind.Name}}' not in json or not json['{{.Pagination.Token.Bind.Name}}']:
            return
          {{if eq "GET" .Verb}}query{{else}}body{{end}}['{{.Pagination.Token.PollField.Name}}'] = json['{{.Pagination.Token.Bind.Name}}']
          {{- else if eq .Pagination.Increment 1 -}}
          query['{{.Pagination.Offset.Name}}'] += 1
          {{- else -}}
          query['{{.Pagination.Offset.Name}}'] += len(json['{{.Pagination.Results.Name}}'])
          {{- end}}
        {{else}}
        json = {{template "method-do" .}}
        return [{{.Pagination.Entity.PascalName}}.from_dict(v) for v in json{{if .Pagination.Results}}.get('{{.Pagination.Results.Name}}', []){{end}}]
        {{end}}

    body = request.as_dict()

    while True:
        json = self._api.do('POST', '/api/2.0/clusters/events', body=body)
        if 'events' not in json or not json['events']:
            return
        for v in json['events']:
            yield ClusterEvent.from_dict(v)
        if 'next_page' not in json or not json['next_page']:
            return
        body = json['next_page']

    while True:
        json = self._api.do('GET', '/api/2.0/repos', query=query)
        if 'repos' not in json or not json['repos']:
            return
        for v in json['repos']:
            yield RepoInfo.from_dict(v)
        if 'next_page_token' not in json or not json['next_page_token']:
            return
        query['next_page_token'] = json['next_page_token']
     */

  private void flip() {
    response = requestFn.apply(request);
    page = itemsFn.apply(response).iterator();
  }

  @Override
  public Iterator<IT> iterator() {
    return new Iterator<IT>() {
      @Override
      public boolean hasNext() {
        if (page.hasNext()) {
          return true;
        }
        request = nextPageFn.apply(response);
        if (request != null) {
          flip();
          return true;
        }
        return false;
      }

      @Override
      public IT next() {
        return page.next();
      }
    };
  }
}
