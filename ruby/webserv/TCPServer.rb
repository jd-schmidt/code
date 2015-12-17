#!/usr/bin/env ruby 
require 'socket'
=begin


socket = TCPServer.new('127.0.0.1', 8089)
client = socket.accept

puts "New client! #{client}"

client.write("Hello from servern")
client.close

=end
## The Above works but it only accepts one client and then closes we want lots of clients so we are doing the below

PORT = 8089
socket = TCPServer.new('127.0.0.1', PORT)

def handle_connection(client, i)
  puts "New client Accepted!! #{client}"
  client.write("Hello from server, you are client #{i}")
  client.close
end

puts "Listening on port: #{PORT}.  Press CTRL+C to end"
count = 0

while client = socket.accept
  count+=1
  Thread.new { handle_connection(client, count) }
end
