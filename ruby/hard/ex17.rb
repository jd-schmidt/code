from_file, to_file = ARGV
script = __FILE__

puts "copying from #{from_file} to #{to_file}."

indata = File.open(from_file).read()

puts "the input file is  #{indata.length} bytes long"
begin
if File.exists?(to_file)
  puts "The output file exist"
  response = ''
  until response == 'y' || response == 'n'
    puts "Do you still want to do this? y/n?"
    response = STDIN.gets.downcase.chomp
  end
  if response == 'n'
    puts "Aborting"
    exit 1
  end
end
rescue Interrupt
  puts "umm no don't bail on me now!!!"
  retry
end
output = File.open(to_file, 'w')
output.write(indata)

puts "Alright, all done"

output.close  


