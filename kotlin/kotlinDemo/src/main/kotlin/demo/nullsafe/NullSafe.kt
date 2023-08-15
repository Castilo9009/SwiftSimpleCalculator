package demo.nullsafe

/**
 * Example derived from Kotlin Docs
 * Created by ian on 5/12/2016.
 */

fun parseInt(str: String): Int?
{
    try
    {
        return Integer.valueOf(str)
    }
    catch(e: NumberFormatException)
    {
        // It isn't an integer.
        return null
    }
}


fun main(args: Array<String>)
{
    if (args.size < 2)
    {
        print("Two integers expected")
        return
    }

    val x = parseInt(args[0])
    val y = parseInt(args[1])

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null)
    {
        if (x == null)
        {
            print("x is null");
        }

        // x and y are automatically cast to non-nullable after null check
        print(x * y)
    }
}