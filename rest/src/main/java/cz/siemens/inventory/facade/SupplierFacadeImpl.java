package cz.siemens.inventory.facade;

import cz.siemens.inventory.api.facade.SupplierFacade;
import cz.siemens.inventory.api.gen.model.Supplier;
import cz.siemens.inventory.dao.SupplierDao;
import cz.siemens.inventory.api.mapper.SupplierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SupplierFacadeImpl implements SupplierFacade {

	private SupplierDao supplierDao;
	private SupplierMapper supplierMapper;

	@Autowired
	public SupplierFacadeImpl(SupplierDao supplierDao, SupplierMapper supplierMapper) {
		this.supplierDao = supplierDao;
		this.supplierMapper = supplierMapper;
	}

	@Override
	public List<Supplier> getSuppliers() {
		return supplierMapper.mapToExternal(supplierDao.findAll());
	}

	@Override
	public Optional<Supplier> getSupplier(long supplierId) {
		return supplierMapper.mapToExternal(supplierDao.findById(supplierId));
	}

	@Override
	public Supplier createSupplier(Supplier supplier) {
		//todo: add validations
		return supplierMapper.mapToExternal(supplierDao.save(supplierMapper.mapToInternal(supplier)));
	}

	@Override
	public Supplier updateSupplier(Supplier supplier) {
		//todo: add validations
		return supplierMapper.mapToExternal(supplierDao.save(supplierMapper.mapToInternal(supplier)));
	}

	@Override
	public void deleteSupplier(long supplierId) {
		supplierDao.deleteById(supplierId);
	}
}
