def add(a,b)
  return a+b
end

def subtract(a,b)
  return a-b
end

def multiply(a,b)
  return a*b
end

def divide(a,b)
  return a/b
end

puts "I don't know why I type these"

age = add(5,21)
height = subtract(78,4)
weight = multiply(90,2)
iq = divide(100,2)

puts "Age: #{age}"
puts "Height: #{height}"
puts "Weight: #{weight}"
puts "IQ: #{iq}"

puts "Here is a puzzle"

what = add(age,subtract(height, multiply(weight, divide(iq, 2))))

puts "That becomes #{what}, can you do it by hand?"
puts "If the answer is -4400, then yes I can."

