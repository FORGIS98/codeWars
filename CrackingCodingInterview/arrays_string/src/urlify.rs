fn urlify(txt: &str, _len: &u32) -> String {
    let mut result = String::new();
    for word in txt.split_whitespace() {
        result.push_str(word);
        result.push_str("%20");
    }

    // We take last %20 out
    result[..(result.len() - 3)].to_string()
}