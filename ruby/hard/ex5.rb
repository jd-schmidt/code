def convert_to_centimeters(inches)
  centimeters = inches * 2.54
end

def weight_to_kilo(pounds)
  kilo = pounds * 0.453592
end
name = "JD Schmidt"
age = 26 # not for long
height = 75 # inches
weight = 185.0 # lbs
eyes = 'Blue'
teeth = 'White'
hair = 'Blonde'

puts "Let's talk about %s." % name
puts "He's %d inches tall." % height
puts "He's %d pounds heavy." % weight
puts "Actually that is not too Heavy."
puts "He's got %s eyes and %s hair." % [eyes , hair]
puts "His teeth are usually %s depending on the coffee." % teeth

# This line I will own
puts "If I add %d, %d, and %d I get %d." % [
  age, height, weight, age + height + weight]

#pass the function my height and get it in cm
height_in_cm = convert_to_centimeters(height)
weight_in_k = weight_to_kilo(weight)


puts "My weight is also %f kilos and my height is %f centimeters" % [weight_in_k , height_in_cm]

