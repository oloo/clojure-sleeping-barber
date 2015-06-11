# Sleeping Barber Problem

The sleeping barber problem involves a single barber with 5 chairs in his barber shop.
When a barber finishes cutting a customers hair in 5 seconds, he goes back to see of 
there are other customers waiting. If there is, he gets the longest waiting one 
and cuts their hair.
If there are no customers, then he returns to his chair and sleeps.

Each customer, when, they arrive, check to see what the barber is doing,
 if he is sleeping, then they sit in the chair
and the barber cuts their hair. If the barber is cutting hair, then they go to
 the waiting room. if there is a free chair,
they sit, otherwise the customer leaves.

## Testing

    lein test

## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
