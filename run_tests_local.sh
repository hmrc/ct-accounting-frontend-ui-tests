#!/usr/bin/env bash

BROWSER=$1
ENVIRONMENT=$2
sbt scalafmtAll scalafmtCheckAll scalafmtSbtCheck clean compile -Dbrowser="${BROWSER:=chrome}" -Daccessibility.timeout=10000.millis -Denvironment="${ENVIRONMENT:=local}" -Dbrowser.usePreviousVersion=true -Dbrowser.option.headless=true "testOnly uk.gov.hmrc.ui.specs*" testReport
