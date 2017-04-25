package xianming.dao;

import xianming.model.CartProduct;

public interface ICartProductDao {
	public void add(CartProduct cp,int oid);
	public void delete(int oid);
}
