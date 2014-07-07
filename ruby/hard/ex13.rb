#!/bin/env/ruby

if ARGV.length > 3
  puts "nice counting, I only needed 3 arguments dumbass..."
end

while ARGV.length < 3
  puts "hummm I don't think we have enough args"
  print "How about you throw me another argument: "
  ARGV << STDIN.gets.chomp()
end

first, second, third = ARGV


puts "The script is called #{$0}"
puts "The first variable is #{first}"
puts "Your second variable is #{second}"
puts "Your third variable is #{third}"

