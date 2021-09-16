use std::cmp::PartialEq;
use std::collections::LinkedList;

fn first_remove_dups<T: PartialEq + Copy>(list: &LinkedList<T>) -> LinkedList<T> {
    let mut linked: LinkedList<T> = LinkedList::new();
    for elem in list {
        if !linked.contains(elem) {
            linked.push_back(*elem);
        }
    }
    linked
}

fn second_remove_dups<T: PartialEq>(list: &mut LinkedList<T>) {
    let mut count = list.len() as i32;
    while count >= 0 {
        match list.pop_front() {
            None => break,
            Some(elem) => {
                if !list.contains(&elem) {
                    list.push_back(elem);
                }
            }
        }
        count -= 1;
    }
}