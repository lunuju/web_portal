pega_array_arquivo -> let it be array1, array2, etc.

int flag = 0; ->  if flag == 0 then goto next array

if flag != 0 then
foreach element of array1 (remember that each one is a UserProfile)
  element_of_array1.getUsername().equals(username_given_by_the_user);
  if true then flag++;
  
  if flag == 0 then goto next array
  
** suppose its not in array1 **

if flag != 0 then
foreach element of array2 (remember that each one is a UserProfile)
  element_of_array1.getUsername().equals(username_given_by_the_user);
  if true then flag++;
  
** suppose its in array2 so flag == 1 **

if flag != 0 then NOT GOING TO HAPPEN BECAUSE flag == 1

...

return UserProfile_found
