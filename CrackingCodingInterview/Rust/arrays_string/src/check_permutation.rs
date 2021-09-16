fn check_permutation(str1: &str, str2: &str) -> bool {
    // I'm guessing if they are the same, one is not
    // really a permutation of the other one.
    if str1.eq(str2) {
        return false;
    }

    let mut str1: Vec<char> = str1.chars().collect();
    let mut str2: Vec<char> = str2.chars().collect();
    str1.sort();
    str2.sort();

    str1.eq(&str2)
}