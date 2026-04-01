"""Inject Databricks Maven proxy mirror into an existing settings.xml.

If no settings.xml exists at the given path, copies the default from
.github/maven-settings.xml instead.
"""
import sys
import xml.etree.ElementTree as ET
from pathlib import Path

MIRROR_XML = """\
  <mirror>
    <id>databricks-maven-proxy</id>
    <mirrorOf>central</mirrorOf>
    <url>https://maven-proxy.dev.databricks.com</url>
  </mirror>"""

settings_path = Path(sys.argv[1])

if not settings_path.exists():
    # No existing settings, just copy the default
    default = Path(__file__).parent / "maven-settings.xml"
    settings_path.parent.mkdir(parents=True, exist_ok=True)
    settings_path.write_text(default.read_text())
    print(f"Copied default maven-settings.xml to {settings_path}")
    sys.exit(0)

# Parse existing settings and inject mirror
tree = ET.parse(settings_path)
root = tree.getroot()

# Handle Maven namespace
ns = ""
if root.tag.startswith("{"):
    ns = root.tag.split("}")[0] + "}"

mirrors = root.find(f"{ns}mirrors")
if mirrors is None:
    mirrors = ET.SubElement(root, "mirrors")

mirror = ET.SubElement(mirrors, "mirror")
ET.SubElement(mirror, "id").text = "databricks-maven-proxy"
ET.SubElement(mirror, "mirrorOf").text = "central"
ET.SubElement(mirror, "url").text = "https://maven-proxy.dev.databricks.com"

tree.write(settings_path, xml_declaration=True, encoding="UTF-8")
print(f"Injected Maven proxy mirror into {settings_path}")
