require 'open-uri'

open("http://54.91.73.192/") do |f|
  f.each_line {|line| p line}
  puts "\n\n"
  puts f.base_uri
  puts f.content_type
  puts f.charset
  puts f.content_encoding
  puts f.last_modified
end
