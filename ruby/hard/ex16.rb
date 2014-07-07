filename = ARGV[0]
script = $PROGRAM_NAME

if ARGV.length != 1
  puts 'you idiot give me a argument'
  exit 1
end
puts "We're going to erase #{filename}."
puts "If you don't want that ^C."
puts "If you do want that hit RETURN."

print "? "
verify = STDIN.gets.chomp()
unless verify == ''
  puts "Not sure what you want"
  exit 1
end

puts "Opening the file...."
target = File.open(filename, 'w')

puts "Truncating the file, hopefully you didn't mess up..."
target.truncate(target.size)

puts "Now I am going to ask for three lines."

print "line 1: "; line1 = STDIN.gets.chomp()
print "line 2: "; line2 = STDIN.gets.chomp()
print "line 3: "; line3 = STDIN.gets.chomp()

puts "I'm going to write these to the file now..."

a = "#{line1}\n#{line2}\n#{line3}\n"
target.write(a)

puts "now I am closing the file"

target.close()



