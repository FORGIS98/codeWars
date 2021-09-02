fn first_is_unique(txt: &str) -> bool {
    let mut chars: Vec<char> = txt.chars().collect();
    chars.sort();
    chars.dedup();
    txt.len() == chars.len()
}

fn second_is_unique(txt: &str) -> bool {
    let mut count = 1;
    for x in txt.bytes() {
        for y in txt[count..].bytes() {
            if x == y {
                return false;
            }
        }
        count += 1;
    }
    true
}
