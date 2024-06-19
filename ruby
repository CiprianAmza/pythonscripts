class Num
  
  @number = ""

  DIGITS = { zero: 0, one: 1, two: 2, three: 3, four: 4, five: 5, six: 6, seven: 7, eight: 8, nine: 9 }

  class << self
    DIGITS.each do |name, digit|
      define_method(name) do
        @number << digit.to_s
        self
      end
    end

    def to_i
      @number += "."
      @number.split(".")[-1].to_i
    end
  end
end
