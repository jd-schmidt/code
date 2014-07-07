def put_args(args)
  puts "The arguments you supplied are:"
  args.each do |x| 
    if args.last.object_id == x.object_id
      puts "'#{x}'"
    else
      printf "'#{x}', "
    end
  end
return args.length
end

def nextone()
  
end

puts "All Functions loaded...\n\n"
