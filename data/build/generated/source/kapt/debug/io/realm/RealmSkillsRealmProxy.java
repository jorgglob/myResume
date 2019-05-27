package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.ProxyUtils;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class RealmSkillsRealmProxy extends com.example.data.models.cache.RealmSkills
    implements RealmObjectProxy, RealmSkillsRealmProxyInterface {

    static final class RealmSkillsColumnInfo extends ColumnInfo {
        long idIndex;
        long nameIndex;
        long levelIndex;
        long urlImageIndex;
        long keywordsIndex;

        RealmSkillsColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmSkills");
            this.idIndex = addColumnDetails("id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", objectSchemaInfo);
            this.levelIndex = addColumnDetails("level", objectSchemaInfo);
            this.urlImageIndex = addColumnDetails("urlImage", objectSchemaInfo);
            this.keywordsIndex = addColumnDetails("keywords", objectSchemaInfo);
        }

        RealmSkillsColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmSkillsColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmSkillsColumnInfo src = (RealmSkillsColumnInfo) rawSrc;
            final RealmSkillsColumnInfo dst = (RealmSkillsColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.nameIndex = src.nameIndex;
            dst.levelIndex = src.levelIndex;
            dst.urlImageIndex = src.urlImageIndex;
            dst.keywordsIndex = src.keywordsIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(5);
        fieldNames.add("id");
        fieldNames.add("name");
        fieldNames.add("level");
        fieldNames.add("urlImage");
        fieldNames.add("keywords");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private RealmSkillsColumnInfo columnInfo;
    private ProxyState<com.example.data.models.cache.RealmSkills> proxyState;
    private RealmList<String> keywordsRealmList;

    RealmSkillsRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmSkillsColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.data.models.cache.RealmSkills>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$level() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.levelIndex);
    }

    @Override
    public void realmSet$level(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'level' to null.");
            }
            row.getTable().setString(columnInfo.levelIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'level' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.levelIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$urlImage() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.urlImageIndex);
    }

    @Override
    public void realmSet$urlImage(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'urlImage' to null.");
            }
            row.getTable().setString(columnInfo.urlImageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'urlImage' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.urlImageIndex, value);
    }

    @Override
    public RealmList<String> realmGet$keywords() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (keywordsRealmList != null) {
            return keywordsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getValueList(columnInfo.keywordsIndex, RealmFieldType.STRING_LIST);
            keywordsRealmList = new RealmList<java.lang.String>(java.lang.String.class, osList, proxyState.getRealm$realm());
            return keywordsRealmList;
        }
    }

    @Override
    public void realmSet$keywords(RealmList<String> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("keywords")) {
                return;
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getValueList(columnInfo.keywordsIndex, RealmFieldType.STRING_LIST);
        osList.removeAll();
        if (value == null) {
            return;
        }
        for (java.lang.String item : value) {
            if (item == null) {
                throw new IllegalArgumentException("Storing 'null' into keywords' is not allowed by the schema.");
            } else {
                osList.addString(item);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("RealmSkills", 5, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("level", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("urlImage", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedValueListProperty("keywords", RealmFieldType.STRING_LIST, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmSkillsColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmSkillsColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmSkills";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.example.data.models.cache.RealmSkills createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.example.data.models.cache.RealmSkills obj = null;
        if (update) {
            Table table = realm.getTable(com.example.data.models.cache.RealmSkills.class);
            RealmSkillsColumnInfo columnInfo = (RealmSkillsColumnInfo) realm.getSchema().getColumnInfo(com.example.data.models.cache.RealmSkills.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.example.data.models.cache.RealmSkills.class), false, Collections.<String> emptyList());
                    obj = new io.realm.RealmSkillsRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("keywords")) {
                excludeFields.add("keywords");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.RealmSkillsRealmProxy) realm.createObjectInternal(com.example.data.models.cache.RealmSkills.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.RealmSkillsRealmProxy) realm.createObjectInternal(com.example.data.models.cache.RealmSkills.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final RealmSkillsRealmProxyInterface objProxy = (RealmSkillsRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("level")) {
            if (json.isNull("level")) {
                objProxy.realmSet$level(null);
            } else {
                objProxy.realmSet$level((String) json.getString("level"));
            }
        }
        if (json.has("urlImage")) {
            if (json.isNull("urlImage")) {
                objProxy.realmSet$urlImage(null);
            } else {
                objProxy.realmSet$urlImage((String) json.getString("urlImage"));
            }
        }
        // TODO implement logic for value list keywords.
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.data.models.cache.RealmSkills createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.example.data.models.cache.RealmSkills obj = new com.example.data.models.cache.RealmSkills();
        final RealmSkillsRealmProxyInterface objProxy = (RealmSkillsRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("level")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$level((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$level(null);
                }
            } else if (name.equals("urlImage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$urlImage((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$urlImage(null);
                }
            } else if (name.equals("keywords")) {
                // TODO implement logic for value list.
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.example.data.models.cache.RealmSkills copyOrUpdate(Realm realm, com.example.data.models.cache.RealmSkills object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.example.data.models.cache.RealmSkills) cachedRealmObject;
        }

        com.example.data.models.cache.RealmSkills realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.example.data.models.cache.RealmSkills.class);
            RealmSkillsColumnInfo columnInfo = (RealmSkillsColumnInfo) realm.getSchema().getColumnInfo(com.example.data.models.cache.RealmSkills.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstString(pkColumnIndex, ((RealmSkillsRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.example.data.models.cache.RealmSkills.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.RealmSkillsRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.example.data.models.cache.RealmSkills copy(Realm realm, com.example.data.models.cache.RealmSkills newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.data.models.cache.RealmSkills) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.example.data.models.cache.RealmSkills realmObject = realm.createObjectInternal(com.example.data.models.cache.RealmSkills.class, ((RealmSkillsRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        RealmSkillsRealmProxyInterface realmObjectSource = (RealmSkillsRealmProxyInterface) newObject;
        RealmSkillsRealmProxyInterface realmObjectCopy = (RealmSkillsRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$level(realmObjectSource.realmGet$level());
        realmObjectCopy.realmSet$urlImage(realmObjectSource.realmGet$urlImage());
        realmObjectCopy.realmSet$keywords(realmObjectSource.realmGet$keywords());
        return realmObject;
    }

    public static long insert(Realm realm, com.example.data.models.cache.RealmSkills object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.data.models.cache.RealmSkills.class);
        long tableNativePtr = table.getNativePtr();
        RealmSkillsColumnInfo columnInfo = (RealmSkillsColumnInfo) realm.getSchema().getColumnInfo(com.example.data.models.cache.RealmSkills.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((RealmSkillsRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, (String)primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((RealmSkillsRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$level = ((RealmSkillsRealmProxyInterface) object).realmGet$level();
        if (realmGet$level != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.levelIndex, rowIndex, realmGet$level, false);
        }
        String realmGet$urlImage = ((RealmSkillsRealmProxyInterface) object).realmGet$urlImage();
        if (realmGet$urlImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlImageIndex, rowIndex, realmGet$urlImage, false);
        }

        RealmList<java.lang.String> keywordsList = ((RealmSkillsRealmProxyInterface) object).realmGet$keywords();
        if (keywordsList != null) {
            OsList keywordsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.keywordsIndex);
            for (java.lang.String keywordsItem : keywordsList) {
                if (keywordsItem == null) {
                    keywordsOsList.addNull();
                } else {
                    keywordsOsList.addString(keywordsItem);
                }
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.data.models.cache.RealmSkills.class);
        long tableNativePtr = table.getNativePtr();
        RealmSkillsColumnInfo columnInfo = (RealmSkillsColumnInfo) realm.getSchema().getColumnInfo(com.example.data.models.cache.RealmSkills.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.example.data.models.cache.RealmSkills object = null;
        while (objects.hasNext()) {
            object = (com.example.data.models.cache.RealmSkills) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((RealmSkillsRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, (String)primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((RealmSkillsRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$level = ((RealmSkillsRealmProxyInterface) object).realmGet$level();
            if (realmGet$level != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.levelIndex, rowIndex, realmGet$level, false);
            }
            String realmGet$urlImage = ((RealmSkillsRealmProxyInterface) object).realmGet$urlImage();
            if (realmGet$urlImage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlImageIndex, rowIndex, realmGet$urlImage, false);
            }

            RealmList<java.lang.String> keywordsList = ((RealmSkillsRealmProxyInterface) object).realmGet$keywords();
            if (keywordsList != null) {
                OsList keywordsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.keywordsIndex);
                for (java.lang.String keywordsItem : keywordsList) {
                    if (keywordsItem == null) {
                        keywordsOsList.addNull();
                    } else {
                        keywordsOsList.addString(keywordsItem);
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.data.models.cache.RealmSkills object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.data.models.cache.RealmSkills.class);
        long tableNativePtr = table.getNativePtr();
        RealmSkillsColumnInfo columnInfo = (RealmSkillsColumnInfo) realm.getSchema().getColumnInfo(com.example.data.models.cache.RealmSkills.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((RealmSkillsRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, (String)primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((RealmSkillsRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$level = ((RealmSkillsRealmProxyInterface) object).realmGet$level();
        if (realmGet$level != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.levelIndex, rowIndex, realmGet$level, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.levelIndex, rowIndex, false);
        }
        String realmGet$urlImage = ((RealmSkillsRealmProxyInterface) object).realmGet$urlImage();
        if (realmGet$urlImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlImageIndex, rowIndex, realmGet$urlImage, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.urlImageIndex, rowIndex, false);
        }

        OsList keywordsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.keywordsIndex);
        keywordsOsList.removeAll();
        RealmList<java.lang.String> keywordsList = ((RealmSkillsRealmProxyInterface) object).realmGet$keywords();
        if (keywordsList != null) {
            for (java.lang.String keywordsItem : keywordsList) {
                if (keywordsItem == null) {
                    keywordsOsList.addNull();
                } else {
                    keywordsOsList.addString(keywordsItem);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.data.models.cache.RealmSkills.class);
        long tableNativePtr = table.getNativePtr();
        RealmSkillsColumnInfo columnInfo = (RealmSkillsColumnInfo) realm.getSchema().getColumnInfo(com.example.data.models.cache.RealmSkills.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.example.data.models.cache.RealmSkills object = null;
        while (objects.hasNext()) {
            object = (com.example.data.models.cache.RealmSkills) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((RealmSkillsRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, (String)primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((RealmSkillsRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$level = ((RealmSkillsRealmProxyInterface) object).realmGet$level();
            if (realmGet$level != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.levelIndex, rowIndex, realmGet$level, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.levelIndex, rowIndex, false);
            }
            String realmGet$urlImage = ((RealmSkillsRealmProxyInterface) object).realmGet$urlImage();
            if (realmGet$urlImage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlImageIndex, rowIndex, realmGet$urlImage, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.urlImageIndex, rowIndex, false);
            }

            OsList keywordsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.keywordsIndex);
            keywordsOsList.removeAll();
            RealmList<java.lang.String> keywordsList = ((RealmSkillsRealmProxyInterface) object).realmGet$keywords();
            if (keywordsList != null) {
                for (java.lang.String keywordsItem : keywordsList) {
                    if (keywordsItem == null) {
                        keywordsOsList.addNull();
                    } else {
                        keywordsOsList.addString(keywordsItem);
                    }
                }
            }

        }
    }

    public static com.example.data.models.cache.RealmSkills createDetachedCopy(com.example.data.models.cache.RealmSkills realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.data.models.cache.RealmSkills unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.data.models.cache.RealmSkills();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.data.models.cache.RealmSkills) cachedObject.object;
            }
            unmanagedObject = (com.example.data.models.cache.RealmSkills) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        RealmSkillsRealmProxyInterface unmanagedCopy = (RealmSkillsRealmProxyInterface) unmanagedObject;
        RealmSkillsRealmProxyInterface realmSource = (RealmSkillsRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$level(realmSource.realmGet$level());
        unmanagedCopy.realmSet$urlImage(realmSource.realmGet$urlImage());

        unmanagedCopy.realmSet$keywords(new RealmList<java.lang.String>());
        unmanagedCopy.realmGet$keywords().addAll(realmSource.realmGet$keywords());

        return unmanagedObject;
    }

    static com.example.data.models.cache.RealmSkills update(Realm realm, com.example.data.models.cache.RealmSkills realmObject, com.example.data.models.cache.RealmSkills newObject, Map<RealmModel, RealmObjectProxy> cache) {
        RealmSkillsRealmProxyInterface realmObjectTarget = (RealmSkillsRealmProxyInterface) realmObject;
        RealmSkillsRealmProxyInterface realmObjectSource = (RealmSkillsRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectTarget.realmSet$level(realmObjectSource.realmGet$level());
        realmObjectTarget.realmSet$urlImage(realmObjectSource.realmGet$urlImage());
        realmObjectTarget.realmSet$keywords(realmObjectSource.realmGet$keywords());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmSkills = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{level:");
        stringBuilder.append(realmGet$level());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{urlImage:");
        stringBuilder.append(realmGet$urlImage());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{keywords:");
        stringBuilder.append("RealmList<String>[").append(realmGet$keywords().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RealmSkillsRealmProxy aRealmSkills = (RealmSkillsRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aRealmSkills.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmSkills.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aRealmSkills.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
