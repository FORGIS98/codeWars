use std::collections::LinkedList;

fn kth_to_last<T: Copy>(mut position: i32, list: &mut LinkedList<T>) -> LinkedList<T> {
    // The easy way: list.split_off(position) but we split list
    // so let's build our own and not split list.
    let mut last: LinkedList<T> = LinkedList::new();
    for item in list.iter() {
        if position == 0 {
            last.push_back(*item);
        } else {
            position -= 1
        }
    }
    last
}