package vn.smarthomeapiadmin.service;

import vn.smarthomeapiadmin.entity.ProductImage;

import java.util.List;
import java.util.Optional;

public interface IProductImageService {
    List<ProductImage> findAll();

    <S extends ProductImage> S save(S entity);

    Optional<ProductImage> findById(Integer integer);
}
