def prompt
  print '> '
end

def get_string()
  prompt
  while input = gets.chomp.to_i
    return input unless input == 0puts " Umm I don't understand"
    puts input
    input = get_string()
  end
  return input;
end

puts "You enter a dark room with two doors.  Do you go through door #1 or door #2?"

door = get_string

if door == 1
  puts "Door 1"
elsif door == 2
  puts "Door 2"
else
  puts "Not a door: %d" % door
end
