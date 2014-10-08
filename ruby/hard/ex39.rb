#!/usr/bin/env ruby

#create a mapping of state to abbreviation
states = {
  'Oregon' => 'OR',
  'Florida' => 'FL',
  'California' => 'CA',
  'New York' => 'NY',
  'Michigan' => 'MI',
  'Idaho' => 'ID'
}

# create a basic set of states and some cities in them

cities = {
  'CA' => 'San Francisco',
  'MI' => 'Detroit',
  'FL' => 'Jacksonville',
  'ID' => 'Boise'
}

# add some more cities
cities['NY'] = "New York"
cities['OR'] = "Portland"

# puts out some cities

puts '-' * 15 
puts "NY State has: #{cities['NY']}"
puts "OR State has: #{cities['OR']}"

# puts some states
puts '-' * 15
puts "Michigan's abbreviation is: #{states['Michigan']}"
puts "Florida's abbreviation is: #{states['Florida']}"

# do it by using the state then cities dict
puts '-' * 15
puts "Michigan has: #{cities[states['Michigan']]}"
puts "Florida has: #{cities[states['Florida']]}"

#puts every state abbreviation
puts '-' * 15
states.each do |state, abb|
  puts "#{state} is abbreviated #{abb}"
end

# puts every city in state
puts '-' * 15
cities.each do |abb, city|
  puts "#{abb} has the city #{city}"
end

# now do both at the same time
puts '-' * 15
states.each do |state, abb|
  city = cities[abb]
  puts "#{state} is abbreviated #{abb} and has city #{city}"
end

puts '-' * 15
# by default ruby says nil when something isn't in there
puts "this below should be nil"
state = states['Texas']

if not state
  puts "Sorry, no Texas."
end

#default values using ||= with the nil result
city = cities['TX']
city ||= 'Does not Exist'
puts "The city for the state 'TX' is: #{city}"
