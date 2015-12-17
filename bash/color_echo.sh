#!/bin/bash 
# Functions

declare -A color
color[red]="1;31"
color[green]="1;32"
color[yellow]="1;33"
color[blue]="1;34"
color[cyan] = "1;36"

put(){
    echo -e "\E[${color[$1]}m$2"
    echo -e '\e[0m'
}

echo_red() {
echo -e "\E[1;31m$1"
echo -e '\e[0m'
}
echo_green() {
echo -e "\E[1;32m$1"
echo -e '\e[0m'
}
echo_yellow() {
echo -e "\E[1;33m$1"
echo -e '\e[0m'
}
echo_cyan() {
echo -e "\E[1;36m$1"
echo -e '\e[0m'
}
put "red" "works?" 
put "green" "Am I green?"
echo_cyan "Does this actually work"
echo_yellow "nope this isn't yellow"
echo_green "Yes it is green!"

