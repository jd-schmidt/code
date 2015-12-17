#!/usr/bin/env ruby
require 'socket'

socket = TCPSocket.new('127.0.0.1', 8089)
socket.write "GET / HTTP/1.1"
socket.write "\r\n\r\n"

puts socket.recv(100)