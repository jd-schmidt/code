

def check(a,b)
  if a != b
    return "WRONG!!!"
  else
    return "correct"
  end
end


a = (true and true)
b = (false and true)
c = (1 == 1 and 2 == 1)
d = ("test" == "test")
e = (1 == 1 or 2 != 1)
f = (true and 1 == 1)
g = ("test" == "testing")
h = (1 != 0 and 2 == 1)
i = ("test" != "testing")
j = ("test" == 1)
k = (not(true and false))
l = (not(1 == 1 or 0 != 1))
m = (not(10 == 1 or 1000 == 1000))
n = (not(1 != 10 or 3 == 4))
o = (not("testing" == "testing" and "Zed" == "Cool Guy"))
p = (1 == 1 and not("testing" == 1 or 1 == 0))
q = ("chunky" == "bacon" and not (3 == 4 or 3 == 3))
r = (3 == 3 and not("testing" == "testing" or "Ruby" == "Fun") )


puts "#{check(a,true)}"
puts "#{check(b,false)}"
puts "#{check(c,false)}"
puts "#{check(d,true)}"
puts "#{check(e,true)}"
puts "#{check(f,true)}"
puts "#{check(g,false)}"
puts "#{check(h,false)}"
puts "#{check(i,true)}"
puts "#{check(j,false)}"
puts "#{check(k,true)}"
puts "#{check(l,false)}"
puts "#{check(m,false)}"
puts "#{check(n,false)}"
puts "#{check(o,true)}"
puts "#{check(p,true)}"
puts "#{check(q,false)}"
puts "#{check(r,false)}"

