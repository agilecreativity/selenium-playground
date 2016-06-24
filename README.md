### README.md

Simple project to demonstate the web automation using Selenium and Java

### Installation

#### Prerequisite

You will need to install and download one of the following before it can be run locally
for your local platform.

- [Google Web Driver](https://sites.google.com/a/chromium.org/chromedriver/downloads)
- [IE Web Web Driver](http://selenium-release.storage.googleapis.com/index.html)
- [Firefox Web Driver](https://github.com/SeleniumHQ/selenium/wiki/FirefoxDriver)
- [Apache Maven](https://maven.apache.org/)

For those who using MacOS you should be able to `brew install` these packages.

#### Basic Setup

- Add [Apache Maven][] to your path e.g. `mvn` command
- Add [Google Web Driver][] or [Firefox Web Driver][] to your path
- Update [src/test/resources/default.properties](src/test/resources/default.properties)

To use point to your current appropriate driver e.g.
For me I have the following setup

```properties
# I am using Linux system, so this is my path to the current driver
webdriver.chrome.driver=/home/bchoomnuan/bin/chromedriver
# Use `which firefox` to get the path
webdriver.firefox.bin=/home/bchoomnuan/apps/firefox/firefox
# Setup this explicitly on my local system
webdriver.firefox.port=7046
```

Then run the project using Maven

```sh
mvn clean test
```

- If you like to run the test from within Eclipse IDE then you can optionally

```
# Then get the dependencies
mvn dependency:sources

# Generate the .project file for use in Eclipse
mvn eclipse:eclipse

# Then import the project to your Eclipse IDE
```

### Notes

* For Linux the test will work properly for older version of Firefox e.g. 35.0.1 e.g. [Firefox 35.0.1][] (tested)

[Google Web Driver]: https://sites.google.com/a/chromium.org/chromedriver/downloads
[IE Web Web Driver]: http://selenium-release.storage.googleapis.com/index.html
[Firefox Web Driver]: https://github.com/SeleniumHQ/selenium/wiki/FirefoxDriver
[Apache Maven]: https://maven.apache.org/
[Firefox 35.0.1]: https://ftp.mozilla.org/pub/firefox/releases/35.0.1/linux-x86_64/en-US/
