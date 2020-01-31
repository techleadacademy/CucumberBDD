package step_definitions;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;
import testData.Coupon;

import java.util.Locale;
import java.util.Map;

public class CouponRegistry implements TypeRegistryConfigurer {

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {

        typeRegistry.defineDataTableType(new DataTableType(Coupon.class, new TableEntryTransformer<Coupon>() {
            @Override
            public Coupon transform(Map<String, String> entry){
                return new Coupon(entry.get("percentage"), entry.get("max use"), entry.get("coupon code"), entry.get("start date"), entry.get("end date"));
            }
        }));
    }

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }
}
