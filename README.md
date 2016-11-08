# repository[![Build Status](https://drone.io/github.com/clairton/model/status.png)](https://drone.io/github.com/clairton/model/latest)

Model base JPA

Para usar será necessário adicionar os repositórios maven:

```xml
<repository>
	<id>mvn-repo-releases</id>
	<url>https://raw.github.com/clairton/mvn-repo/releases</url>
</repository>
<repository>
	<id>mvn-repo-snapshot</id>
	<url>https://raw.github.com/clairton/mvn-repo/snapshots</url>
</repository>
```
 Também adicionar as depêndencias:
```xml
<dependency>
    <groupId>br.eti.clairton</groupId>
	<artifactId>model</artifactId>
	<version>${latestVersion}</version>
</dependency>
```
