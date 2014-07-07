#!/usr/bin/env ruby

def prompt
  print '> '
end

def get_string()
  prompt
  input = gets.chomp.to_i
  unless input != 0
    puts " Umm I don't understand"
    input = get_string()
  end
  return input;
end

puts "You enter a dark room with three doors.  Do you go through door #1 or door #2?"

door = get_string

if door == 1
  puts "There' sa giant bear here eating a cheese cake.  What do you do?"
  puts "1.  Take the cake."
  puts "2.  Scream at the bear."

  bear = get_string

  if bear == 1
    puts "The bear eats your face off.  Good Job!"
  elsif bear == 2
    puts "The bear eats your legs off.  Good Job!"
  else
    puts "Well doing #{bear} is probably better, because the Bear ran away."
  end

elsif door == 2
  puts "You stare into the endless abyss at Cthuhlu's retina"
  puts "1.  Blueberries."
  puts "2.  Yellow jacket clothespins."
  puts "3.  Understanding revolvers yelling melodies."

  insanity = get_string

  if insanity == 1 or insanity == 2
    puts "Your body survives powered by a mind of jello.  Good job!"
  else
    puts "The insanity rots your eyes into a pool of muck.  Good Job!"
  end

elsif door == 3
  puts "You enter a room, with a bowl of yellow Jello and a key in it..."
  puts "Do you: "
  puts "1.  Eat the Jello and grab the key?"
  puts "2.  Dig through the jello to grab the key?"
  jello = get_string
  if jello == 1
    puts "That was dumb, jello was poison, you die.  Good Job!"
  elsif jello == 2
    puts "Although smart not to eat the Jello, the key is useless and now Bill Cosby is pissed."
  else
    puts "Welp I don't know what #{jello} is but Bill Cosby was behind the door and your dead now."
  end
  exit 0
end



