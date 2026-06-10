select a.item_id
    , a.item_name
    , a.rarity
from item_info a
    join item_tree b
        on a.item_id = b.item_id
    join item_info c
        on b.parent_item_id = c.item_id
where c.rarity = 'RARE'
order by a.item_id desc;