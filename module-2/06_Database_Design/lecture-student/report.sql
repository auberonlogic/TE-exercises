SELECT * FROM customer;

SELECT c.customer_last_name || ', ' || c.customer_first_name,
a.artist_id || ' - ' || a.artist_name,
pa.title, DATE(p.purchase_date), p.price
FROM customer c
JOIN purchase p USING(customer_id)
JOIN painting pa USING(painting_id)
JOIN artist a USING(artist_id)
;