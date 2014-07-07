#!/usr/bin/ruby

user = ARGV.first
some_item = ARGV.last
prompt = '> '

puts "Hi #{user}, I am the #{__FILE__} script"
puts "I'd like to ask you a few questions."
likes = ' ' 
until likes.downcase == 'yes' || likes.downcase == 'no'
  puts "Do you like me #{user}?"
  print prompt
  likes = STDIN.gets.chomp()
end

puts "Where do you live #{user}?"
print prompt
lives = STDIN.gets.chomp()

puts "What type of computer do you have?"
print prompt
computer = STDIN.gets.chomp()


puts <<MESSAGE
Alright so you said #{likes} about liking me.
You live in #{lives}.  Not sure where that is... I can't parse
And you have a #{computer} computer.  Nice....
You have #{some_item} in your inventory. 
MESSAGE


