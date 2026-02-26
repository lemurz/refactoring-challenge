package edu.iutcs.cr.repository;

import edu.iutcs.cr.persons.Seller;

public interface SellerRepository {
    Seller findById(String id);
}
