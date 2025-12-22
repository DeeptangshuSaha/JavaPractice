#!/bin/bash

if [ -z "$1" ]; then
  echo "Usage: jr <mission{num}.micromission{num}.ClassName"
  exit 1
fi

java -cp out "$1"