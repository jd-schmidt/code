#!/usr/bin/env ruby
 
def array_me(maxnum,incre)
  i = 0
  array = []
  while i < maxnum
    array << i      
    i += incre
    puts "Numbers now: #{array}"
  end
  return array
end
def array_me_for
  numbers = []
  for i in 1..100
     numbers << i
  end
  return numbers
end

#numbers = array_me(1000,100)
numbers = array_me_for
puts "The numbers: "

for num in numbers
  puts num
end
