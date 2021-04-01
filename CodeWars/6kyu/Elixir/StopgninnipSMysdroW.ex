defmodule StopgninnipSMysdroW do
  def fun(str) do
    String.split(str, " ", trim: true)
    |> Enum.map(fn x -> 
      if(String.length(x) >= 5) do
        String.reverse(x)
      else
        x
      end
    end)
    |> Enum.join(" ")
  end
end
