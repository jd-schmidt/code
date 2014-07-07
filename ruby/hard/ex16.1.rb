#!/bin/env/ruby

if ARGV.length == 1
  puts "Using the argument passed as the file"
  file = File.open(ARGV[0])
else
  file = File.open("a")
end

puts File.read(file)

file.close

