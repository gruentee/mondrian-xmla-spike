mondiran-xmla-spike
===================

Spike out mondrian XML/A

## Download derby

You'll need to download derby-foodmart.zip from https://github.com/pentaho/mondrian/blob/0513fbe724619a7c669009b7539bf51d1faaa858/demo/derby/derby-foodmart.zip.

You can't download from github directly so will need to clone the repo or download from [Sourceforge](http://sourceforge.net/projects/mondrian/files/mondrian/mondrian-3.5.0/)
and locate the derby-foodmart.zip

Then:
```bash
mkdir -p src/main/webapp/WEB-INF/classes/
unzip derby-foodmart.zip -d src/main/webapp/WEB-INF/classes/
```

## Running
Given a good JAVA_HOME
run ```mvn clean compile exec:java```
