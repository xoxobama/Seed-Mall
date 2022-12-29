package com.product.mapper;

import java.util.List;

import com.product.model.CategoryVO;
import com.product.model.ProductVO;

public interface ProductMapper {
	
	int insertProduct(ProductVO vo);
	
	List<ProductVO> getProdList();
	
	int updateProd(ProductVO vo);
	
	List<ProductVO> selectByspec(String spec);
	
	List<ProductVO> selectByCategory(CategoryVO cvo);
	
	ProductVO selectByIdx(int idx);
}
