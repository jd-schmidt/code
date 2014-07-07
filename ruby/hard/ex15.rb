#assign cmd line param to filename
filename = ARGV[0]

prompt = '> '
#txt is now a file
txt = File.open(filename)


puts "Here's your file: #{filename}"
puts txt.read()

puts "I'll also ask you to type it again: "
print prompt
#read another file
file_again = STDIN.gets.chomp()

txt_again = File.open(file_again)

puts txt_again.read()

txt_again.close
txt.close
puts "txt"
puts txt
puts "txt_again"
puts txt_again

unless txt.nil? && txt_again.nil?
  puts "ERROR closing files but script is exiting so...."
  exit 1
end


