INSERT INTO vets VALUES (1, 'James', 'Carter');
INSERT INTO vets VALUES (2, 'Helen', 'Leary');
INSERT INTO vets VALUES (3, 'Linda', 'Douglas');
INSERT INTO vets VALUES (4, 'Rafael', 'Ortega');
INSERT INTO vets VALUES (5, 'Henry', 'Stevens');
INSERT INTO vets VALUES (6, 'Sharon', 'Jenkins');

INSERT INTO specialties VALUES (1, 'radiology');
INSERT INTO specialties VALUES (2, 'surgery');
INSERT INTO specialties VALUES (3, 'dentistry');

INSERT INTO vet_specialties (id, vet_id, specialty_id) VALUES (nextval('hibernate_sequence'), 2, 1);
INSERT INTO vet_specialties (id, vet_id, specialty_id) VALUES (nextval('hibernate_sequence'), 3, 2);
INSERT INTO vet_specialties (id, vet_id, specialty_id) VALUES (nextval('hibernate_sequence'), 3, 3);
INSERT INTO vet_specialties (id, vet_id, specialty_id) VALUES (nextval('hibernate_sequence'), 4, 2);
INSERT INTO vet_specialties (id, vet_id, specialty_id) VALUES (nextval('hibernate_sequence'), 5, 1);

INSERT INTO types VALUES (1, 'cat');
INSERT INTO types VALUES (2, 'dog');
INSERT INTO types VALUES (3, 'lizard');
INSERT INTO types VALUES (4, 'snake');
INSERT INTO types VALUES (5, 'bird');
INSERT INTO types VALUES (6, 'hamster');

INSERT INTO owners (id, first_name, last_name, address, city, telephone) VALUES (nextval('owners_id_seq'), 'George', 'Franklin', '110 W. Liberty St.', 'Madison', '6085551023');
INSERT INTO owners (id, first_name, last_name, address, city, telephone) VALUES (nextval('owners_id_seq'), 'Betty', 'Davis', '638 Cardinal Ave.', 'Sun Prairie', '6085551749');
INSERT INTO owners (id, first_name, last_name, address, city, telephone) VALUES (nextval('owners_id_seq'), 'Eduardo', 'Rodriquez', '2693 Commerce St.', 'McFarland', '6085558763');
INSERT INTO owners (id, first_name, last_name, address, city, telephone) VALUES (nextval('owners_id_seq'), 'Harold', 'Davis', '563 Friendly St.', 'Windsor', '6085553198');
INSERT INTO owners (id, first_name, last_name, address, city, telephone) VALUES (nextval('owners_id_seq'), 'Peter', 'McTavish', '2387 S. Fair Way', 'Madison', '6085552765');
INSERT INTO owners (id, first_name, last_name, address, city, telephone) VALUES (nextval('owners_id_seq'), 'Jean', 'Coleman', '105 N. Lake St.', 'Monona', '6085552654');
INSERT INTO owners (id, first_name, last_name, address, city, telephone) VALUES (nextval('owners_id_seq'), 'Jeff', 'Black', '1450 Oak Blvd.', 'Monona', '6085555387');
INSERT INTO owners (id, first_name, last_name, address, city, telephone) VALUES (nextval('owners_id_seq'), 'Maria', 'Escobito', '345 Maple St.', 'Madison', '6085557683');
INSERT INTO owners (id, first_name, last_name, address, city, telephone) VALUES (nextval('owners_id_seq'), 'David', 'Schroeder', '2749 Blackhawk Trail', 'Madison', '6085559435');
INSERT INTO owners (id, first_name, last_name, address, city, telephone) VALUES (nextval('owners_id_seq'), 'Carlos', 'Estaban', '2335 Independence La.', 'Waunakee', '6085555487');

INSERT INTO pets (id, name, birth_date, type_id, owner_id) VALUES (nextval('pets_id_seq'), 'Leo', '2010-09-07', 1, 1);
INSERT INTO pets (id, name, birth_date, type_id, owner_id) VALUES (nextval('pets_id_seq'), 'Basil', '2012-08-06', 6, 2);
INSERT INTO pets (id, name, birth_date, type_id, owner_id) VALUES (nextval('pets_id_seq'), 'Rosy', '2011-04-17', 2, 3);
INSERT INTO pets (id, name, birth_date, type_id, owner_id) VALUES (nextval('pets_id_seq'), 'Jewel', '2010-03-07', 2, 3);
INSERT INTO pets (id, name, birth_date, type_id, owner_id) VALUES (nextval('pets_id_seq'), 'Iggy', '2010-11-30', 3, 4);
INSERT INTO pets (id, name, birth_date, type_id, owner_id) VALUES (nextval('pets_id_seq'), 'George', '2010-01-20', 4, 5);
INSERT INTO pets (id, name, birth_date, type_id, owner_id) VALUES (nextval('pets_id_seq'), 'Samantha', '2012-09-04', 1, 6);
INSERT INTO pets (id, name, birth_date, type_id, owner_id) VALUES (nextval('pets_id_seq'), 'Max', '2012-09-04', 1, 6);
INSERT INTO pets (id, name, birth_date, type_id, owner_id) VALUES (nextval('pets_id_seq'), 'Lucky', '2011-08-06', 5, 7);
INSERT INTO pets (id, name, birth_date, type_id, owner_id) VALUES (nextval('pets_id_seq'), 'Mulligan', '2007-02-24', 2, 8);
INSERT INTO pets (id, name, birth_date, type_id, owner_id) VALUES (nextval('pets_id_seq'), 'Freddy', '2010-03-09', 5, 9);
INSERT INTO pets (id, name, birth_date, type_id, owner_id) VALUES (nextval('pets_id_seq'), 'Lucky', '2010-06-24', 2, 10);
INSERT INTO pets (id, name, birth_date, type_id, owner_id) VALUES (nextval('pets_id_seq'), 'Sly', '2012-06-08', 1, 10);

INSERT INTO visits (id, pet_id, visit_date, description) VALUES (1, 7, '2013-01-01', 'rabies shot');
INSERT INTO visits (id, pet_id, visit_date, description) VALUES (2, 8, '2013-01-02', 'rabies shot');
INSERT INTO visits (id, pet_id, visit_date, description) VALUES (3, 8, '2013-01-03', 'neutered');
INSERT INTO visits (id, pet_id, visit_date, description) VALUES (4, 7, '2013-01-04', 'spayed');