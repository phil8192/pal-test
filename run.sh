#!/bin/bash
JAR=target/palindromes-jar-with-dependencies.jar
if [ ! -e $JAR ]; then
  echo "first run make"
  exit 0
fi

java -cp $JAR palindromes.Pal $@

