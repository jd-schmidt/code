#!/usr/bin/env ruby

the_count = [1, 2, 3, 4, 5]
fruits = ['apples', 'oranges', 'pears', 'apricots']
change = [1, 'pennies', 2, 'dimes', 3, 'quarters']

# This first kind of for loop goes through an array
for number in the_count
  puts "This is the count: #{number}"
end

#Same as above but uses a block instead
fruits.each do |fruit|
  puts "a fruit of type: #{fruit}"
end

#also we can go through mixed arrays too
for i in change
  puts "I got #{i}"
end

#We can also build arrays, first we start with an empty array elements
elements = []

#Then use a range object to do 0 to 5 count
for i in (0..5)
  puts "Adding #{i} to the list"
  #push is a function - no shit
  elements.push(i)
end


for i in elements
  puts "Element was #{i}"
end

