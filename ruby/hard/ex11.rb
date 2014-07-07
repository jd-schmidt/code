def convert_to_centimeters(inches)
  centimeters = inches * 2.54
end

def weight_to_kilo(pounds)
  kilo = pounds * 0.453592
end
print "How old are you? "
age = gets.chomp()
print "How tall are you? "
height = gets.chomp().to_i
print "How much do you weight? "
weight = gets.chomp().to_i

weight_in_kilo = weight_to_kilo(weight)
height_in_cm = convert_to_centimeters(height)

puts "so you're #{age} years old, #{height} inches tall, and #{weight} pounds fat"
puts "So you are also #{weight_in_kilo} kilos heavy and #{height_in_cm} cm tall"
