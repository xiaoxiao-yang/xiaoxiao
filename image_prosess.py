import cv2
import os
import random
import shutil

class BatchRename():
    '''
    批量重命名文件夹中的图片文件
    '''
    # 'E:\\picture\\guohua\\guohuatotal\\'
    # 'E:\\picture\\guohua\\resize_guohuatotal\\'

    def __init__(self, soupath, despath, size):
        self.soupath = soupath  #表示需要命名处理的文件夹
        self.despath = despath
        self.size = size
        if not os.path.exists(despath):
            os.mkdir(despath)

    # 图片重命名
    def rename(self):
        filelist = os.listdir(self.soupath) #获取文件路径
        random.shuffle(filelist)
        total_num = len(filelist) #获取文件长度（个数）
        print(total_num)
        i = 1  #表示文件的命名是从1开始的
        for item in filelist:
            if item.endswith('.jpg') | item.endswith('.png') | item.endswith('.jpeg'):  #初始的图片的格式为jpg格式的（或者源文件是png格式及其他格式，后面的转换格式就可以调整为自己需要的格式即可）
                src = os.path.join(os.path.abspath(self.soupath), item)
                dst = os.path.join(os.path.abspath(self.soupath), 'guohua_'+str(i) + '.jpg')#处理后的格式也为jpg格式的，当然这里可以改成png格式

                try:
                    os.rename(src, dst)
                    print('converting %s to %s ...' % (src, dst))
                    i = i + 1
                except:
                    continue
        print('total %d to rename & converted %d jpgs' % (total_num, i))

    # 将图片resize为299*299的大小
    def resize(self):
        filelist = os.listdir(self.soupath)
        i = 0
        for item in filelist:
            i = i + 1
            img_source = cv2.imread(self.soupath + item)
            try:
                image = cv2.resize(img_source, (self.size, self.size), 0, 0, cv2.INTER_LINEAR)
                cv2.imwrite(self.despath + str(i) + '.jpg', image)
            except:
                os.remove(self.soupath + item)
                continue
            print('处理完第%d张图片' % i)

    def remove(self):
        filelist = os.listdir(self.soupath)
        random.shuffle(filelist)
        train_pic = filelist[:int(len(filelist)*0.8)]
        test_pic = filelist[int(len(filelist)*0.8):]
        print(len(train_pic))
        print(len(test_pic))
        # 修改图片保存路径
        train_path = 'E:/picture/artResize/train/shuifen/'
        test_path = 'E:/picture/artResize/test/shuifen/'
        if not os.path.exists(train_path):
            os.mkdir(train_path)
        if not os.path.exists(test_path):
            os.mkdir(test_path)

        # 测试集数据移动
        for item in test_pic:
            filename = self.soupath + item
            test_path1 = test_path + item
            shutil.copy(filename, test_path1)  # 复制

        for item in train_pic:
            filename = self.soupath + item
            test_path1 = train_path + item
            shutil.copy(filename, test_path1)  # 复制
        print('remove finished!')

if __name__ == '__main__':
    # 各类艺术total图像
    src = 'E:\\picture\\art5\\art\\shuifen_totalresize2\\'
    des = 'E:\\picture\\art5\\Art_resize\\shuifen_resize\\'
    demo = BatchRename(des, src, 299)
    # demo.rename()
    # demo.resize()
    demo.remove()