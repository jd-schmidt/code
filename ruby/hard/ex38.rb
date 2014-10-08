#!/usr/bin/env ruby

ten_things = "Apples Oranges Crows Telephone Light Sugar"

puts "Wait there's not 10 things in that list, let's fix that."

stuff = ten_things.split(' ')

more_stuff = ["Day", "Night", "Song", "Frisbee", "Corn", "Banana", "Girl", "Boy"]

#use math to make sure there are 10 things

while stuff.length != 10
  next_one = more_stuff.pop
  puts "Adding: #{next_one}."
  stuff.push(next_one)
  puts "There's #{stuff.length} items now."
end

puts "There we go: #{stuff}"

puts "Let's do some things with stuff."

puts stuff[1]
puts stuff[-1] #fancy pants
a = puts stuff.pop()
puts stuff.join (' ')
puts stuff[3..5].join"#"
puts "a = #{a}"
