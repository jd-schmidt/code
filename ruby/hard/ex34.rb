#!/usr/bin/env ruby

animals = ['bear', 'python', 'peacock',
  'kangaroo', 'whale', 'platypus']


animals.each do |x|
  puts x
end

#just a puts animals
puts "\n"
printf "#{animals}\n"
puts "#{animals}"

for i in 0..animals.length 
  puts animals[i-1]
end

