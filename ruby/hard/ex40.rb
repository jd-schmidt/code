class Plant

  def initialize(age,type,color,height)
    @age = age
    @type = type
    @color = color
    @height = height
  end

  def toString()
     return "Plant age is #{@age}, type is #{@type}, color is #{@color}, and height is #{@height}"
  end

  def getHeight()
    return @height
  end

end


i = 5
tree = Plant.new(5,'tree', 'Green', 5 * 80)


puts tree.toString()
