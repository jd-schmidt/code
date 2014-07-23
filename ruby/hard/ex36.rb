#!/usr/bin/env ruby

$dagger = false
$snake = true
$stabby = false
#each turn get user input
def prompt()
  print '> '
  input = gets.chomp
end


def start_room()
  puts "You are in a cold granite cavern with 3 doors one to the left, one to the right, and one straight ahead."
  puts "Which way do you go?"
  while true
    next_move = prompt
    if next_move.include? 'left'
      left_room()
    elsif next_move.include? 'right'
      right_room()
    elsif next_move.include? 'straight'
      straight_room()
    else
      puts "I don't really understand its not that hard..."
    end
  end
end

def left_room()
  puts "This room contains a empty room with a small room with 4 levers"
  puts "The levers are all the same made out of what appears to be elephant tusks"
  puts "which option do you choose?"
  puts "(1) Pull lever 1"
  puts "(2) Pull lever 2"
  puts "(3) Pull lever 3"
  puts "(4) Pull lever 4"
  puts "(5) Go back where you came from"

  while true
    next_move = prompt()

    if (1..4).member?(next_move.to_i)
      random_lever()
    elsif next_move == '5'
      puts "You are too scared to pull a lever.."
      start_room()
    else
      puts "I got no idea what that means..."
    end
  end
end

def right_room
  if $snake == true
    puts "In this room is a large hungry snake with green eyes."
    puts "He, it, whatever stares at you and you go insane."
    puts "Do you flee for your life or eat your head?"
  elsif $snake == false
    if $stabby == false
      puts "There is a large dead snake on the floor."
    end
    puts "The room is starting to smell funky."
  end

  next_move = prompt()

  if ['flee', 'go back', 'return', 'left'].any? {|str| next_move.include?(str)}
    start()
  elsif next_move.include? "eat your head"
    dead("well that was tasty.")
  elsif ['kill', 'stab', 'attack'].any? {|str| next_move.include?(str)}
    if $dagger == false 
      puts "You attempt to kill the snake with your bare hands."
      dead("Having no weapon the snake prevails and is no longer hungry")
    elsif $dagger == true && $snake == true
      puts "You pull out your dagger ready for the snake"
      puts "The snake leaps at you and you swiftly chop off its head in one motion."
      puts "Good job you killed the snake.  Yet your still stuck in this damn sewer..."
      $snake = false
    elsif $snake == false && $stabby == false
      puts "You stab its body a few more times just to make sure..... Yup its definately dead now."
      $stabby = true
    elsif $snake == false  && $stabby == true
      puts "Since you are obsessed with stabbing the snake, game is over"
      dead("You are sick minded man")
    end
    right_room()
  else
    puts "Don't waste your time, what do you do?"
    right_room()
  end
end

def straight_room()
  puts "The room is clamy, and smells of rotten flesh."
  puts "There are piles of skeleton bones on edges of the room."
  #only print this one if dagger is false
  if $dagger == false
    puts "You see one of the adventurers had a dagger."
  end
  puts "There is also a large button on the far end of the room."
  puts "What are you going to do?"

  next_move = prompt
  if next_move.include? 'button'
    puts "You push the button and instantly feel the regret as a napalm like substance falls from the ceiling."
    dead("You fall to the ground in excruciating pain wishing for it to be over.")
  elsif next_move.include? 'dagger'
    $dagger = true
    puts "You pickup the sweet jeweled dagger. Now what?"
    straight_room()
  elsif ['go back', 'flee', 'return', 'leave'].any? {|str| next_move.include?(str) }
    puts "You return to the previous room"
    start_room()
  else
    puts "That I don't understand...Give me a break."
    straight_room()
  end
end

def dead(why)
  puts "#{why}"
  exit 1
end
def win(why)
  puts "#{why}"
  exit 0
end

def random_lever()
  option = rand(1..4)
  case option
  when 1
    puts "As you pull the lever gold flows from the ceiling drowning you in riches.  A ladder also appears from the sky."
    puts "You climb out and start planning your retirement."
    win("CONGRATULATIONS!!!")
  when 2
    puts "You panic as the floor below you falls away and you land with a hard thump"
    puts "For a brief instant you saw an orange circle on the ceiling and a blue one where the floor had fallen away.."
    left_room()
  when 3
    puts "The room fills with a smooth hot liquid you run to the door but it is to late."
    dead("Yet another adventure's bones to add to the pile...")
  when 4
    puts "The room fills with gas and you slowly close your eyes..."
    start()
  else
    dead("Haha error in the program opps")
  end
end

def start()
  puts "You wake up with a pounding headache in a sewer"
  puts "You don't know how you got here.  There is a foul stench and the sqweek of rats nearby."
  start_room()
end

start()

