namespace csharp;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine(CountVowels("Celebration"));

        Console.WriteLine(CountVowels("Palm"));

        Console.WriteLine(CountVowels("Prediction"));
    }

    private static int CountVowels(string word)
    {
        HashSet<char> vowels = new HashSet<char>() { 'a', 'e', 'i', 'o', 'u' };
        return word
            .Select(c => c.ToString().ToLower()[0])
            .Count(c => vowels.Contains(c));
    }
}