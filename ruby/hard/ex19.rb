def cheese_and_crackers(cheese_count, boxes_of_crackers)
  puts "You have #{cheese_count} cheeses!"
  puts "You have #{boxes_of_crackers} boxes of crackers!"
  puts "Man that's enough for a party!"
  puts "Get a blanket."
  puts 
end

puts "We can give the function numbers directly: "
cheese_and_crackers(20,30)

puts "Or we can use variables in our scripts"
amount_of_cheese = 10 / 100 * 5
amount_of_crackers = 5 * 5 * 2
cheese_and_crackers(amount_of_cheese,amount_of_crackers)

puts "We can even do math inside too"
cheese_and_crackers(20 + 20 + 20, 5 * 8)

puts "Or we can combine the 2 ways into one"
cheese_and_crackers(amount_of_cheese + 10, amount_of_crackers + 8)
